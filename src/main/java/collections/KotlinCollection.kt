package collections

/**
 * @author Alexander Naumov.
 */

/**
 * Data class that represents music album.
 */
data class Album(val title: String,
                 val year: Int,
                 val chartUK: Int,
                 val chartUS: Int,
                 val tracks: List<Track> = listOf())

/**
 * Data class that represents musical track.
 */
data class Track(val title:String,
                 val durationInSeconds:Int)

val albums = listOf(
        Album("The Dark Side of the Moon", 1973, 2, 1,
                listOf(Track("Speak to Me", 90),
                        Track("Breathe", 163),
                        Track("On he Run", 216),
                        Track("Tine", 421),
                        Track("The Great Gig in the Sky", 276),
                        Track("Money", 382),
                        Track("Us and Then", 462),
                        Track("Any Color You Like", 205),
                        Track("Brain Damage", 228),
                        Track("Eclipse", 123))),

        Album("Wish You Were Here", 1975, 1, 1),
        Album("Animals", 1977, 2, 3),
        Album("The Paper at the Gates of Down", 1967, 6, 131),
        Album("The Final Cut", 1983, 1, 6),
        Album("Meddle", 1971, 3, 70),
        Album("Atom Heart Mother", 1970, 1, 55),
        Album("UmmaGumma", 1968, 9, 8),
        Album("A Sauceaful of Secrets", 1969, 5, 74),
        Album("More", 1969, 9, 153)
)

/**
 * @return list of [Pair] of [Album.title] and [Track.title], that
 * filters by [durationInSeconds] less then durationInSeconds.
 */
fun albumAndTrackLowerThenXSeconds(durationInSeconds: Int, albums:List<Album>):List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < durationInSeconds
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun main(args: Array<String>) {

    val titles = albums.filter { it.chartUK == 1 }.map { Pair(it.title, it.year) }

    titles.forEach { println(it) }

    albumAndTrackLowerThenXSeconds(200, albums).forEach { println(it) }
}