package io.github.emusute1212.memotte.util.bindings

import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.BindingAdapter

@BindingAdapter(
    value = [
        "onTransitionStarted",
        "onTransitionChange",
        "onTransitionCompleted",
        "onTransitionTrigger"
    ],
    requireAll = false
)
fun MotionLayout.setListener(
    onTransitionStartedListener: OnTransitionStartedListener?,
    onTransitionChangeListener: OnTransitionChangeListener?,
    onTransitionCompletedListener: OnTransitionCompletedListener?,
    onTransitionTriggerListener: OnTransitionTriggerListener?
) {
    setTransitionListener(object : MotionLayout.TransitionListener {
        override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {
            onTransitionStartedListener?.onTransitionStarted(motionLayout, startId, endId)
        }

        override fun onTransitionChange(
            motionLayout: MotionLayout?,
            startId: Int,
            endId: Int,
            progress: Float
        ) {
            onTransitionChangeListener?.onTransitionChange(
                motionLayout,
                startId,
                endId,
                progress
            )
        }

        override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
            onTransitionCompletedListener?.onTransitionCompleted(
                motionLayout,
                currentId
            )
        }

        override fun onTransitionTrigger(
            motionLayout: MotionLayout?,
            triggerId: Int,
            positive: Boolean,
            progress: Float
        ) {
            onTransitionTriggerListener?.onTransitionTrigger(
                motionLayout,
                triggerId,
                positive,
                progress
            )
        }
    })
}

fun interface OnTransitionStartedListener {
    fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int)
}

fun interface OnTransitionChangeListener {
    fun onTransitionChange(
        motionLayout: MotionLayout?,
        startId: Int,
        endId: Int,
        progress: Float
    )
}

fun interface OnTransitionCompletedListener {
    fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int)
}

fun interface OnTransitionTriggerListener {
    fun onTransitionTrigger(
        motionLayout: MotionLayout?,
        triggerId: Int,
        positive: Boolean,
        progress: Float
    )
}