; .(dot) special form
; returns the value of a java field or invokes a java method
; it can also be used to return the value of an instance field

; general form
; (. class field)
; (. instance field)

(. java.lang.Math PI)

; getting the value of PI from the java.lang.Math
(println (. java.lang.Math PI))