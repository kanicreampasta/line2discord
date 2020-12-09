package com.kanicreampasta.line2discord

import java.util.concurrent.Executors
import kotlin.concurrent.thread

fun main() {
    val mainClasses: MutableList<MainInterface> = ArrayList()

    // add mainClasses here.
    //mainClasses.add(LineMain())
    //mainClasses.add(DiscordMain())

    val threads = mainClasses.map {
        Thread { it.main(emptyArray()) }
    }

    threads.forEach { it.run() }
    threads.forEach {  it.join() }
}

