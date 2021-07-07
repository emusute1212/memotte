package io.github.emusute1212.memotte.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\"\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J*\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u0012"}, d2 = {"Lio/github/emusute1212/memotte/android/util/SimpleTransitionListener;", "Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionListener;", "onTransitionChange", "", "motionLayout", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "startId", "", "endId", "progress", "", "onTransitionCompleted", "currentId", "onTransitionStarted", "onTransitionTrigger", "triggerId", "positive", "", "android_debug"})
public abstract interface SimpleTransitionListener extends androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener {
    
    @java.lang.Override()
    public abstract void onTransitionStarted(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId);
    
    @java.lang.Override()
    public abstract void onTransitionChange(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress);
    
    @java.lang.Override()
    public abstract void onTransitionCompleted(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId);
    
    @java.lang.Override()
    public abstract void onTransitionTrigger(@org.jetbrains.annotations.Nullable()
    androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onTransitionStarted(@org.jetbrains.annotations.NotNull()
        io.github.emusute1212.memotte.android.util.SimpleTransitionListener $this, @org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId) {
        }
        
        @java.lang.Override()
        public static void onTransitionChange(@org.jetbrains.annotations.NotNull()
        io.github.emusute1212.memotte.android.util.SimpleTransitionListener $this, @org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int startId, int endId, float progress) {
        }
        
        @java.lang.Override()
        public static void onTransitionCompleted(@org.jetbrains.annotations.NotNull()
        io.github.emusute1212.memotte.android.util.SimpleTransitionListener $this, @org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int currentId) {
        }
        
        @java.lang.Override()
        public static void onTransitionTrigger(@org.jetbrains.annotations.NotNull()
        io.github.emusute1212.memotte.android.util.SimpleTransitionListener $this, @org.jetbrains.annotations.Nullable()
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
        }
    }
}