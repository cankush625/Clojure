(defn factorial [n]
    (if (= n 0) 1
        (* n (factorial (dec n)))))

(println (factorial 5))