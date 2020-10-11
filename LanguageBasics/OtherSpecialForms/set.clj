; set! special form
; assigns value of an expression to the field of an instance or class specified by a dot form

; general form
; (set! dot-form expression)

; assign 3 to the static field PI of the java.lang.Math class
(set! (. java.lang.Math PI) 3)