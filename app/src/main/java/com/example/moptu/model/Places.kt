package com.example.moptu.model

import android.app.ActivityManager.TaskDescription
import com.example.moptu.R

object Places {
    data class Place(val imageResId: Int, val title: String, val description: String)
    fun getPlaces() : List<Place> {
        return listOf(
            Place(
                R.drawable.snowy_mountains,
                "SNOWY MOUNTAINS",
                "There’s something very beautiful about a pure snow-covered landscape. It’s like taking an already beautiful mountain and covering it with icing. These two mountains in the Aleutian Islands – Pavlof 1 and Pavlof 2 – don’t really even look real. Add a cloud inversion into the mix and all of a sudden you’re on another planet.\n" +
                        "\n" +
                        "Luckily you can experience the beauty of a snowy mountain pretty much all over the world. Anywhere cold enough or high enough (or both!) for snow and you’re sorted.\n",
            ),
            Place(
                R.drawable.craters_and_lagoons,
                "CRATERS AND LAGOONS",
                "Ah Iceland, land of ice and fire and ridiculously long words that no visitor can pronounce, giving Welsh a run for its money! Iceland has a very volcanic history (there aren’t many places with black sand beaches) which has shaped a unique and beautiful landscape. But, we’re here to talk specifically about the craters and lagoons. We had to include the image above, with its surprisingly vivid colours and sweeping view into the mountains.\n" +
                        "\n" +
                        "You can find similar mountain lakes, left behind by glaciers, far more widely than just Iceland. Glacial valleys can be seen from the Lake District to the Alps and right across mountainous areas in the world. At least, any place where there was ice millions of years ago.\n",
            ),
            Place(
                R.drawable.ice_caves,
                "ICE CAVES",
                "On the subject of ice, let’s give ice a beautiful landscape point in its own right. Iceland definitely isn’t the only place you can find big expanses of ice and glaciers. However, we do know that you can walk inside the glaciers in Iceland. As if ice wasn’t beautiful enough, you can walk under a translucent blue ceiling.\n",
            ),
            Place(
                R.drawable.volcanic_landscapes,
                "VOLCANIC LANDSCAPES",
                "Err, okay anyone would think we have a thing about volcanoes… but they do make for some very beautiful landscapes. Beautiful in the extreme kind of way. We love how nature produces these crazily vivid colours. Eat your heart out artificial food colouring! Although, you don’t want to be eating or drinking anything in made naturally in the Danakil Depression, Ethiopia. Pretty much everything is toxic.\n" +
                        "\n",
            ),
            Place(
                R.drawable.water,
                "WATER",
                "There is water everywhere that there’s not land. Duh. About 70% of the Earth’s surface is covered in water (and about 60% of the human body is water, which is kind of interesting). So we reckon that water is very underrated when it comes to beautiful landscapes. Particularly big expanses of water, not just lakes or lagoons or rivers. They’re cool too, but there’s something impressive about water all the way to the horizon. It certainly gives you a bit of perspective.\n" +
                        "\n" +
                        "Of course, we’d much rather be out on it than just looking at it, like kayaking the Greek coast or island hopping in Sweden. We also love the Norwegian fjords, where vast bodies of mirror-still water are surrounded by craggy mountains.\n" +
                        "\n",
            ),
            Place(
                R.drawable.jungle,
                "JUNGLE",
                "A wimba-way, a wimba-way, a…. just kidding. But the mighty jungle has many beautiful landscapes, regardless of whether there’s a sleeping lion in it. In fact, there’s probably not going to be a sleeping lion because lions don’t live in the jungle – which brings up a whole load of questions that our childhood selves need answered.\n" +
                        "\n" +
                        "While we go and work that out, you can experience the real jungle for yourself. Like on a 100km jungle expedition across Colombia. The Samana Watershed is a biodvierse rainforest paradise, rarely visited by tourists. No lions. Promise.\n"
            ),
            Place(
                R.drawable.desert,
                "DESERT",
                "The lions let us down, but the camels won’t. Once upon a time the Sahara desert was under water. Now instead of water as far as you can see, it’s sand as far as you can see. Kind of like you’ve been shrunk to the size of an ant and left in a sand pit… but without the threat of giant children.\n" +
                        "\n" +
                        "Perhaps what's even more amazing than the baron, immense desert though, is the towns and human dwellings that spring up within it, such as the above Ait Benhaddou - an ancient city in Morocco.\n",
            ),
            Place(
                R.drawable.rock_formations,
                "ROCK FORMATIONS",
                "The strange rock formations of the Old Man of Storr on Scotland's Isle of Skye creates an ethereal landscape. Maybe it reminds us of magical towers or the gates of Mordor. We’re not sure, but there’s definitely an edge of fantasy to pillars of rock. Or perhaps the location scouts for fantasy films are just creating a self-propagating circle. Skye is a wild and bleak mountainous island ready for adventure.",
            ),
            Place(
                R.drawable.forest,
                "FOREST",
                "Okay, yes, we could have picked any number of forests. There’s something beautiful about deciduous trees changing colour with the seasons. It’s like seeing autumn happen in front of you. The forests of Slovenia are gorgeous in autumn and we learnt that first hand on a team trip to Slovenia. Even if your adventure doesn’t go 100% to plan, you can still enjoy being in nature.\n" +
                        "\n",
            )
        )
    }
}