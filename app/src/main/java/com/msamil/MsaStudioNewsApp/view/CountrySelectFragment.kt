package com.msamil.MsaStudioNewsApp.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.msamil.MsaStudioNewsApp.R
import kotlinx.android.synthetic.main.fragment_country_select.*


class CountrySelectFragment : Fragment() {
     var countrCode1 = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity!!.overridePendingTransition(R.anim.updown,R.anim.slide_up)





        val dataSh = activity!!.getSharedPreferences("com.msamil.newspaperfinal",Context.MODE_PRIVATE)
        val codes2 =dataSh.getString("code","q")

            buttontr.setOnClickListener {
                countrCode1 = "country=tr&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","tr").apply()


            }
            buttonar.setOnClickListener {
                countrCode1 = "country=ar&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","es").apply()

            }
            buttonuk.setOnClickListener {
                countrCode1 = "country=gb&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","en").apply()

            }
            buttonus.setOnClickListener {
                countrCode1 = "country=us&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","en").apply()

            }
            buttonfr.setOnClickListener {
                countrCode1 = "country=fr&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","fr").apply()

            }
            buttonca.setOnClickListener {
                countrCode1 = "country=ca&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","en").apply()

            }
            buttonprc.setOnClickListener {
                countrCode1 = "country=cn&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","zh").apply()

            }
            buttonde.setOnClickListener {
                countrCode1 = "country=de&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","de").apply()

            }
            buttonin.setOnClickListener {
                countrCode1 = "country=in&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","en").apply()
            }
            buttonit.setOnClickListener {
                countrCode1 = "country=it&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","it").apply()
            }
            buttonjp.setOnClickListener {
                countrCode1 = "country=jp&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","jp").apply()
            }
            buttonmy.setOnClickListener {
                countrCode1 = "country=my&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","my").apply()
            }
            buttonrus.setOnClickListener {
                countrCode1 = "country=ru&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","ru").apply()
            }
            buttonsg.setOnClickListener {
                countrCode1 = "country=sg&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","zh").apply()
            }
            buttonsk.setOnClickListener {
                countrCode1 = "country=kr&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","ko").apply()
            }
            buttoneg.setOnClickListener {
                countrCode1 = "country=eg&"
                val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
                Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","ar").apply()
            }
            buttonid.setOnClickListener {
            countrCode1 = "country=id"
            val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
            Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","id").apply()
        }
            buttonsa.setOnClickListener {
                countrCode1 = "country=sa&"
            val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
            Navigation.findNavController(it).navigate(action)
                dataSh.edit().putString("code",countrCode1).apply()
                dataSh.edit().putString("cate1","").apply()
                dataSh.edit().putString("language","ar").apply()
        }

        buttonbra.setOnClickListener {

            countrCode1 = "country=br&"
            val action = CountrySelectFragmentDirections.actionCountrySelectFragmentToFeedFragment2(countrCode1)
            Navigation.findNavController(it).navigate(action)
            dataSh.edit().putString("code",countrCode1).apply()
            dataSh.edit().putString("cate1","").apply()
            dataSh.edit().putString("language","pt").apply()

        }

    }
}