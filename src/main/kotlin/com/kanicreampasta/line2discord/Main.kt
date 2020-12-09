package com.kanicreampasta.line2discord

import com.kanicreampasta.line2discord.discord.DiscordMain
import java.util.concurrent.Executors
import kotlin.concurrent.thread

fun main() {
    val mainClasses: MutableList<MainInterface> = ArrayList()

    // discord variables
    val discordToken = System.getProperty("DISCORD_TOKEN")
    val discordChannelName = System.getProperty("DISCORD_CHAN_NAME")

    // add mainClasses here.
    //mainClasses.add(LineMain())
    mainClasses.add(DiscordMain(discordToken, discordChannelName))

    val threads = mainClasses.map {
        Thread { it.main() }
    }

    threads.forEach { it.run() }
    threads.forEach {  it.join() }
}

