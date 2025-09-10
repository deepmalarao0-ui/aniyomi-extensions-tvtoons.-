package eu.kanade.tachiyomi.animeextension.en.tvtoons

import eu.kanade.tachiyomi.animesource.model.AnimeFilterList
import eu.kanade.tachiyomi.multisrc.zorotheme.ZoroTheme
import eu.kanade.tachiyomi.lib.rapidcloudextractor.RapidCloudExtractor
import kotlin.getValue

class TVToons : ZoroTheme(
    "en",
    "TVToons",
    "https://tvtoons.co",
    hosterNames = listOf(
        "Vidstreaming",
        "Vidcloud",
    ),
)
