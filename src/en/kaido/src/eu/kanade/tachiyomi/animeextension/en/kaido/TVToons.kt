package eu.kanade.tachiyomi.animeextension.en.tvtoons

import eu.kanade.tachiyomi.animesource.model.AnimeFilterList
import eu.kanade.tachiyomi.multisrc.zorotheme.ZoroTheme
import eu.kanade.tachiyomi.lib.rapidcloudextractor.RapidCloudExtractor

class TVToons : ZoroTheme(
    "en",                     // Language
    "TVToons",                // Source name
    "https://tvtoons.co",     // Base URL
    hosterNames = listOf(     // Supported video hosts
        "Vidstreaming",
        "Vidcloud",
    ),
) {
    // Enable RapidCloud extractor for video playback
    override val useRapidCloudExtractor = true

    // Filters (empty if TVToons has no advanced filters)
    override fun getFilterList(): AnimeFilterList = AnimeFilterList()
}
