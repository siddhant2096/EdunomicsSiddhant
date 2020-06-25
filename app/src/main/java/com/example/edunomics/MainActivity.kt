package com.example.edunomics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val search=findViewById<MultiAutoCompleteTextView>(R.id.searchspace)
        val skillbutton=findViewById<Button>(R.id.skillbutton)
        skillbutton.setOnClickListener {
            search.hint="How to learn a Skill?"
        }
        val careerbutton=findViewById<Button>(R.id.careerbutton)
        careerbutton.setOnClickListener {
            search.hint="How to get a Career?"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        if(id == R.id.loginmenubutton)
        {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent,Bundle())        }
        return super.onOptionsItemSelected(item)
    }

}
