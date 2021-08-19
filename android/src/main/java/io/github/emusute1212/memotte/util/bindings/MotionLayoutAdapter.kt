package io.github.emusute1212.memotte.util.bindings

import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.BindingAdapter

@BindingAdapter(
    value = [
        "onTransitionStartedListener",
        "onTransitionToStartCompletedListener",
        "onTransitionToEndCompletedListener"
    ],
    requireAll = false
)
fun MotionLayout.setListener(
    onTransitionStartedListener: OnTransitionStartedListener?,
    onTransitionToStartCompletedListener: OnTransitionToStartCompletedListener?,
    onTransitionToEndCompletedListener: OnTransitionToEndCompletedListener?
) {
    setTransitionListener(object : MotionLayout.TransitionListener {
        override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {
            onTransitionStartedListener?.onTransitionStarted()
        }

        override fun onTransitionChange(
            motionLayout: MotionLayout?,
            startId: Int,
            endId: Int,
            progress: Float
        ) {
            onTransitionStartedListener?.onTransitionStarted()
        }

        override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
            if (motionLayout == null) return
            if (motionLayout.progress == 0.0F) {
                onTransitionToStartCompletedListener?.onTransitionToStartCompleted()
            } else if (motionLayout.progress == 1.0F) {
                onTransitionToEndCompletedListener?.onTransitionToEndCompleted()
            }
        }

        override fun onTransitionTrigger(
            motionLayout: MotionLayout?,
            triggerId: Int,
            positive: Boolean,
            progress: Float
        ) {
        }
    })
}

fun interface OnTransitionStartedListener {
    fun onTransitionStarted()
}

fun interface OnTransitionToStartCompletedListener {
    fun onTransitionToStartCompleted()
}

fun interface OnTransitionToEndCompletedListener {
    fun onTransitionToEndCompleted()
}