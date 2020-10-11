; do
; runs the body of expressions in order
; returns the value returned by the last expression in the body

; general form
; (do body)

(do
    (def add (+ 2 3))
    (def mul (* 2 3))
    (println add)
    (println mul))

; using returned value from the do
(def exprVal (do
    (+ 2 3)
    (* 2 3)))
(println exprVal)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; recur special form
; recur is equivalent to the while or the for loop
; it may only be used in 'tail position'

; general form
; (recur arguments)

(defn exprVal1 [x y]
    (println x y)
    (if (< x 9)
        (recur (inc x) (dec y))))

(exprVal1 5 2)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; loop special form
; like let, but also establishes a recursion point for recur
; for the sake of enclosed functions, each iteration creates separate bindings

; general form
; (loop [bindings] body)

(loop [x 5 y 2]
    (println x y)
    (if (< x 9)
        (recur (inc x) (dec y))))