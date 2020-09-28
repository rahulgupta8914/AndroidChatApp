package com.example.loginappmvvm.ui.adapters

import android.view.View
import android.widget.Button
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout


@BindingAdapter("buttonTextLabel")
fun bindButtonTextLabel(button: Button, buttonTextLabel: String){
    button.text = buttonTextLabel.capitalize()
}

@BindingAdapter("hintText")
fun bindHintText(textInputLayout: TextInputLayout, hintText: String){
    textInputLayout.hint = hintText.capitalize()
}

@BindingAdapter("visibleOrGone")
fun View.setVisibleOrGone(show: Boolean) {
    visibility = if (show) View.VISIBLE else View.GONE
}

@BindingAdapter("visible")
fun View.setVisible(show: Boolean) {
    visibility = if (show) View.VISIBLE else View.INVISIBLE
}