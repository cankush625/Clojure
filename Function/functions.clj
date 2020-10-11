; fn special form
; parameters are denoted as the symbols in a vector
; When the function is called, it returns the value of the last expression in its body
; if the last parameter is preceded with &, it receives zero or more arguments as a list
; functions are lexically scoped

; general form
; (fn [parameters] body)

(fn [x y z]
    (+ x y))

; assigning the function object to the var of symbol is common, so clojure provides a keyword defn
; the function below is equivalent to the function next to it that is function written using defn
(def val
    (fn [x y z]
        (+ x y)))

(defn addition [x y z]
    (+ x y))