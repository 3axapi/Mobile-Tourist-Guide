package com.example.moptu.adapters

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setMargins

class CommentsGridAdapter (
    private var context: Context,
    private var comment_names: List<String>,
    private var comment_emails: List<String>,
    private var comment_ratings: List<String>,
    private var comment_contents: List<String>
    ) : BaseAdapter() {
    override fun getCount(): Int = comment_names.size

    override fun getItem(position: Int): Any = comment_names[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val container: LinearLayout
        val commentSection: LinearLayout
        val namesSection: LinearLayout
        val contentsSection: LinearLayout
        val nameView: TextView
        val emailView: TextView
        val simpleView: View
        val underView: View
        val contentsView: TextView
        val ratingView: TextView

        if (convertView == null) {
            container = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL

                val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                this.layoutParams = params
            }

            commentSection = LinearLayout(context).apply {
                orientation = LinearLayout.HORIZONTAL

                val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                this.layoutParams = params
            }

            namesSection = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL

                val params = LinearLayout.LayoutParams(300, LinearLayout.LayoutParams.WRAP_CONTENT)
                this.layoutParams = params
            }

            contentsSection = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL

                val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                this.layoutParams = params
            }

            nameView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = "\uD83D\uDE4B\u200D♂\uFE0F: ${comment_names[position]}"
            }

            emailView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = comment_emails[position]
            }

            simpleView = View(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 2
                ).also {
                    it.setMargins(0, 5, 25, 5)
                }
                setBackgroundColor(Color.parseColor("#000000"))
            }

            underView = View(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 3
                ).also {
                    it.setMargins(0, 15, 0, 20)
                }
                setBackgroundColor(Color.parseColor("#cccccc"))
            }

            ratingView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = "☆: ${comment_ratings[position]}"
            }

            contentsView = TextView(context).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                text = comment_contents[position]
            }

            namesSection.addView(nameView)
            namesSection.addView(simpleView)
            namesSection.addView(emailView)

            contentsSection.addView(ratingView)
            contentsSection.addView(contentsView)

            commentSection.addView(namesSection)
            commentSection.addView(contentsSection)

            container.addView(commentSection)
            container.addView(underView)
        } else {
            container = convertView as LinearLayout
        }

        return container
    }
}