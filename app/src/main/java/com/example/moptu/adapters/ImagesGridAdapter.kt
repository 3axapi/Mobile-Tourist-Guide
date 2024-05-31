package com.example.moptu.adapters

import android.content.ClipDescription
import android.content.Context
import android.graphics.Typeface
import android.media.Image
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.app.NotificationCompat.Style
import androidx.core.view.marginBottom
import androidx.core.view.setMargins
import com.example.moptu.R
import com.example.moptu.model.Places
import kotlinx.coroutines.newFixedThreadPoolContext

interface OnImageClickListener {
    fun onImageClick(placeTitle: String, imageId: Int, placeDescription: String)
}

class ImagesGridAdapter (
    private val context: Context,
    private val titlesList: List<String>,
    private val imagesList: List<Int>,
    private val descriptionList: List<String>,
    private val listener: OnImageClickListener
    ) : BaseAdapter() {
    override fun getCount(): Int = imagesList.size

    override fun getItem(position: Int): Any = imagesList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val linearLayout: LinearLayout
        val imageView: ImageView
        val textView: TextView

        if (convertView == null) {
            linearLayout = LinearLayout(context).apply {
                orientation = LinearLayout.HORIZONTAL

                val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply { setMargins(0, 0, 0, 25) }
                this.layoutParams = params
            }

            imageView = ImageView(context).apply {
                layoutParams = LinearLayout.LayoutParams(450, 350).also {
                    it.setMargins(8, 8, 8, 8)
                }
                scaleType = ImageView.ScaleType.CENTER_CROP
            }

            textView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
                )
                text = titlesList[position]
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                setTextSize(20f)
                setTypeface(null, Typeface.BOLD)
                gravity = Gravity.CENTER
            }

            linearLayout.addView(imageView)
            linearLayout.addView(textView)
        } else {
            linearLayout = convertView as LinearLayout
            imageView = linearLayout.getChildAt(0) as ImageView
        }

        imageView.setImageResource(imagesList[position])
        linearLayout.setOnClickListener {
            listener.onImageClick(titlesList[position], imagesList[position], descriptionList[position])
        }

        return linearLayout
    }
}