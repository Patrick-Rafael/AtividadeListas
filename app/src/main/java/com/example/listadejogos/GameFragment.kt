package com.example.listadejogos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadejogos.adapter.GameAdapter
import com.example.listadejogos.model.Game

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_game, container, false)

        val list = arrayListOf<Game>()
        list.add(Game("Ocarina of time","1998","99","https://www.wasd.pt/wp-content/uploads/2018/01/zelda-wasd-ocarina-time.png"))
        list.add(Game("Tony Hawk's 2", "2000","98","https://upload.wikimedia.org/wikipedia/pt/a/a9/Tony_Hawk%27s_Pro_Skater_2_n64_cover.png"))
        list.add(Game("Grand Theft Auto IV","2008","98","https://upload.wikimedia.org/wikipedia/pt/thumb/9/91/Grand_Theft_Auto_IV_capa.png/270px-Grand_Theft_Auto_IV_capa.png"))
        list.add(Game("SoulCalibur","1999","98","https://static.wikia.nocookie.net/soulcalibur/images/5/51/Soulcalibur.jpg/revision/latest/scale-to-width-down/256?cb=20080404202435"))
        list.add(Game("Super Mario Galaxy","2007","97","https://upload.wikimedia.org/wikipedia/pt/b/b1/Super_Mario_Galaxy_capa.png"))
        list.add(Game("Super Mario Galaxy 2", "2010","97","https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/wii_24/SI_Wii_SuperMarioGalaxy2_image1600w.png"))
        list.add(Game("Red Dead Redemption 2","2018", "97","https://img.hype.games/cdn/facad932-4082-4d20-980d-34bb385d2233Red-Dead-Redemption-2-Ultimate-Edition-Cover.jpg"))
        list.add(Game("Grand Theft Auto V","2014","97","https://s2.glbimg.com/WmmVGs-siP9ByEsz9KFf-eXmAVE=/0x0:695x391/984x0/smart/filters:strip_icc()/s.glbimg.com/po/tt2/f/original/2015/04/29/splash4.jpg"))
        list.add(Game("Breath of the Wild","2017","97","https://www.nintendo.com//content/dam/noa/pt_BR/games/switch/t/the-legend-of-zelda-breath-of-the-wild-switch/the-legend-of-zelda-breath-of-the-wild-switch-hero.jpg"))


        val recycleGame = view.findViewById<RecyclerView>(R.id.listinha)
        recycleGame.layoutManager = LinearLayoutManager(view.context)
        recycleGame.adapter = GameAdapter(list)

        return view ;
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GameFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GameFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}