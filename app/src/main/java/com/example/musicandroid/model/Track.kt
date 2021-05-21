package com.example.musicandroid.model

data class Track (
    val album: Album,
    val artists: List<Artist>,
    val available_makets: List<String>,
    val disc_number: Int,
    val duration_ms: Int,
    val explicit: Boolean,
    val external_id: ExternalId,
    val extarnal_url: ExternalUrl,
    val href: String,
    val id: String,
    val is_local: Boolean,
    val name: String,
    val popularity: Int,
    val preview_url: String,
    val track_number: Int,
    val type: String,
    val uri: String
) {
    override fun toString(): String {
        return name
    }
}
