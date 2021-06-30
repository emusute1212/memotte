package io.github.emusute1212.memotte.android.util

import androidx.constraintlayout.motion.widget.MotionLayout

interface SimpleTransitionListener : MotionLayout.TransitionListener {
    override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}
    override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}
    override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {}
    override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
}