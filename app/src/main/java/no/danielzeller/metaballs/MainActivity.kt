package no.danielzeller.metaballs

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import no.danielzeller.metaballslib.CircularMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeAdaper(createSmallMenuItemList(), R.id.circularMenuTopRight)
        initializeAdaper(createSmallMenuItemList(), R.id.circularMenuTopLeft)
        initializeAdaper(createSmallMenuItemList(), R.id.circularMenuBottomRight)
        initializeAdaper(createSmallMenuItemList(), R.id.circularMenuBottomLeft)
        initializeAdaper(createLargeMenuItemList(), R.id.circularMenuCenter)

    }

    private fun createLargeMenuItemList(): ArrayList<MenuItem> {
        val menuItem1 = ArrayList<MenuItem>()
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.facebook_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.instagram_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.twitter_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.linkedin_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.dribble_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.google_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.vimeo_animation, null), Color.WHITE))
        menuItem1.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.behance_animation, null), Color.WHITE))
        return menuItem1
    }

    private fun createSmallMenuItemList(): ArrayList<MenuItem> {
        val menuItem2 = ArrayList<MenuItem>()
        menuItem2.add(MenuItem(resources.getColor(R.color.colorAccent), resources.getDrawable(R.drawable.facebook_animation, null), Color.WHITE))
        menuItem2.add(MenuItem(resources.getColor(R.color.colorPrimary), resources.getDrawable(R.drawable.instagram_animation, null), Color.WHITE))
        menuItem2.add(MenuItem(resources.getColor(R.color.colorAccent), resources.getDrawable(R.drawable.twitter_animation, null), Color.WHITE))
        return menuItem2
    }

    private fun initializeAdaper(menuItem1: ArrayList<MenuItem>, viewId: Int) {
        val circularTopRight = findViewById<CircularMenu>(viewId)
        circularTopRight.adapter = CircularMenuAdapter(menuItem1)
        circularTopRight.onItemSelectedListener = { index ->
            Toast.makeText(baseContext, "Clicked: " + index, Toast.LENGTH_LONG).show()
            circularTopRight.toggleMenu()
        }
    }
}