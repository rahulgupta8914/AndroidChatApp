package com.example.loginappmvvm.ui.adapters

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.loginappmvvm.R
import com.google.android.material.textfield.TextInputLayout


@BindingAdapter("buttonTextLabel")
fun bindButtonTextLabel(button: Button, buttonTextLabel: String){
    button.text = buttonTextLabel.capitalize()
}

@BindingAdapter("hintText")
fun bindHintText(textInputLayout: TextInputLayout, hintText: String){
    textInputLayout.hint = hintText.capitalize()
}

@BindingAdapter("imageUrl")
fun bindImageUrl(imageView: ImageView, url: String){
    print("null url ")
    if (url.isEmpty()){
        val drawableList = listOf(
            R.drawable.ic_boy_1,
            R.drawable.ic_boy_2,
            R.drawable.ic_girl_1,
            R.drawable.ic_girl_2,
            R.drawable.ic_man_1,
            R.drawable.ic_man_2,
            R.drawable.ic_man_3,
            R.drawable.ic_man_4,
            R.drawable.ic_man_5,
        )
        imageView.setImageResource(drawableList.random())
    }else{
        imageView.setImageURI(Uri.parse(url));
    }
}

@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}