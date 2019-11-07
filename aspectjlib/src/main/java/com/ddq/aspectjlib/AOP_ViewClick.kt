package com.ddq.aspectjlib

import android.util.Log
import android.view.View
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

/**
 * Author : ddq
 * Time : 2019/11/7 14:17
 * Description :
 */
@Aspect
class AOP_ViewClick {

    @Before("execution(* android.view.View.OnClickListener.onClick(android.view.View))")
    fun log(joinPoint: JoinPoint){
        val view = joinPoint.args[0] as View
        Log.e("tag",view.contentDescription.toString())
    }

    @After("execution(@com.ddq.aspectjlib.AOP_Log * *(String))")
    fun log1(joinPoint: JoinPoint) {
        val jp = joinPoint

        Log.e("tag",jp.args.size.toString())

        Log.e("tag",jp.kind)
        Log.e("tag",jp.signature.name)
        Log.e("tag",jp.signature.declaringTypeName)
        Log.e("tag",jp.signature.declaringType.canonicalName)


        joinPoint.args.forEach {
            Log.e("tag",it.toString())
        }
    }
}