package com.kanicreampasta.line2discord.discord

import com.kanicreampasta.line2discord.MainInterface

class DiscordMain(private val token: String, private val channelName: String) : MainInterface {

    override fun main() {
        val api = API(token, channelName)
        // TODO
    }

}