package com.vipul.browse.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.vipul.browse.adapter.BookmarkAdapter
import com.vipul.browse.databinding.ActivityBookmarkBinding

class BookmarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBookmarkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBookmarks.setItemViewCacheSize(5)
        binding.rvBookmarks.hasFixedSize()
        binding.rvBookmarks.layoutManager = LinearLayoutManager(this)
        binding.rvBookmarks.adapter = BookmarkAdapter(this, isActivity = true)
    }
}