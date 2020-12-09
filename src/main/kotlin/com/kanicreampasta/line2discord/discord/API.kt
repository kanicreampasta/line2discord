package com.kanicreampasta.line2discord.discord

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder

class API(token: String, private val channelName: String) {
    private val jda: JDA = JDABuilder.createDefault(token)
        .build()

    init {
        jda.awaitReady()
    }

    fun sendTextMessage(text: String) {
        jda.getTextChannelsByName(channelName, true)
            .forEach {
                it.sendMessage(text)
            }
    }
}