package com.samirankumar11.uikitshowcase.utils

import android.content.Context
import android.widget.Toast


/**
 * Shows a Toast message.
 *
 * @param message Text to display
 * @param duration Toast duration (default: LENGTH_LONG | LENGTH_SHORT)
 */
fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}