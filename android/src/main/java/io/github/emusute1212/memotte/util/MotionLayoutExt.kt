package io.github.emusute1212.memotte.util

import androidx.constraintlayout.motion.widget.MotionLayout

interface SimpleTransitionListener : MotionLayout.TransitionListener {
    override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {}
    override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {}
    override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {}
    override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {}
}