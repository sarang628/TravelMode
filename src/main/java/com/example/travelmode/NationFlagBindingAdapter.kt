package com.example.travelmode

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:src")
fun src(imageView: ImageView?, drawable: Int) {
    imageView?.setImageResource(drawable)
}