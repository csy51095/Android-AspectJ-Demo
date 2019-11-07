package com.ddq.aspectjlib

/**
 * Author : ddq
 * Time : 2019/11/7 17:01
 * Description :
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class AOP_Log(val value:String)