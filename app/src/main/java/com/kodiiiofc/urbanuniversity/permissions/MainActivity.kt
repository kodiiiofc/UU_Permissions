package com.kodiiiofc.urbanuniversity.permissions

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.kodiiiofc.urbanuniversity.permissions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        setSupportActionBar(binding.toolbarInclude.toolbar)

        binding.cameraBtn.setOnClickListener {
            val permission = Manifest.permission.CAMERA
            permissionLauncherCamera.launch(permission)

        }
        binding.contactsBtn.setOnClickListener {
            val permission = Manifest.permission.READ_CONTACTS
            permissionLauncherContacts.launch(permission)
        }
    }

    private val permissionLauncherContacts = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            val intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        } else {
            Snackbar.make(binding.root, "Разрешения не предоставлены", Snackbar.LENGTH_LONG).show()
        }
    }

    private val permissionLauncherCamera = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        } else {
            Snackbar.make(binding.root, "Разрешения не предоставлены", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_exit -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

}