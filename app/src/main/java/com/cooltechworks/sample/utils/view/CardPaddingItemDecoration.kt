package com.cooltechworks.sample.utils.view


import android.content.Context
import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView
import android.util.TypedValue
import android.view.View

class CardPaddingItemDecoration(context: Context) : RecyclerView.ItemDecoration() {

    private val paddingBetweenItems = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8f, context.resources.displayMetrics).toInt()

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        outRect.set(0, 0, 0, paddingBetweenItems)
    }
}
