package com.dm.tutorialbasicactivity401

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Sostituisci con la tua azione", Snackbar.LENGTH_LONG)
                    .setAction("Azione", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Popola il menu; questo aggiunge elementi alla barra delle azioni, se presente.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Gestisci i clic sugli elementi della barra delle azioni qui.
        // La barra delle azioni gestirà automaticamente i clic sul pulsante Home / Su,
        // purché specifichi un'attività genitore in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}