package uz.akra.dars5hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import uz.akra.dars5hw5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerForContextMenu(binding.settings)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.settings_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_profile->{
                Toast.makeText(this, "Profilga o'tilyapti", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_feedback->{
                Toast.makeText(this, "Fikringiz biz uchun muhim", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_rating->{
                Toast.makeText(this, "Baholash uchun Play marketga kiring", Toast.LENGTH_SHORT).show()
            }


        }
        return super.onContextItemSelected(item)
    }

}