; counting the number of key-value pairs in the map

(println(count {1 2 "hello" 5}))

; counting the number of key-value pairs in the vector

(println(count [1 2 3 4]))

; counting the number of key-value pairs in the list

(println(count '(1 2 3 4)))

; using contains to find if the collection contains the specific element
; for the map, contains function will only search of the element is a key. If the element we have
; to find is present in the value then it will return false

(println(contains? {1 2 "hi" 5} 1)) ; 1 is present as a key
(println(contains? {1 2 "hi" 5} "hi")) ; "hi" is present as a key
(println(contains? {1 2 "hi" 5} 5)) ; 5 is not a key
(println(contains? {1 2 "hi" 5} 4)) ; 4 doesn't present in the map as a key

; for the vector, contains function will look if the index is present in the vector. If the
; element is not a index within the vector then it will return false

(println(contains? [1 7 2 5] 2)) ; index 2 is present
(println(contains? [1 7 2 5] -5)) ; index -5 doesn't exist
(println(contains? [1 7 2 5] 4)) ; index 4 is doesn't exist(out of bound)

; contains function should not be used with the lists because lists are not keyed sequenses

; (println(contains? '(1 7 2 5) 2)) ;(IllegalArgumentException)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; core collection functions
(println ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" )

; conj: 'conjoin' returns new collection with an added element or key-value pair

(println(conj {1 2 "hi" 4} ["bye" 2])) ; output: {1 2, hi 4, bye 2}
(println(conj {1 2 "hi" 5} ["hi", 3])) ; output: {1 2, hi 3}

(println(conj [1 2 4 6 7] true)) ; output: [1 2 4 6 7 true]
(println(conj '(1 2 4 6 7) true)) ; output: (true 1 2 4 6 7)

; assoc: 'associate' returns new collection with added/modified value for given key or index

(println ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" )

(println(assoc {1 2 "hi" 4} "bye" 2)) ; output: {1 2, hi 4, bye 2}
(println(assoc {1 2 "hi" 5} "hi", 3)) ; output: {1 2, hi 3}

(println(assoc [1 2 4 6 7] 3 true)) ; output: [1 2 4 true 7]
(println(assoc [1 2 4 6 7] 4 true)) ; output: [1 2 4 6 true]
(println(assoc [1 2 4 6 7] 5 true)) ; output: [1 2 4 6 7 true]

; (println(assoc '(1 2 4 6 7) 3 true)) ; output: throws error(assoc doesn't work with list)

; dissoc: 'dissociate' returns new map in which a key has been removed

(println ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" )

(println(dissoc {1 2 "hi" 4} "hi")) ; output: {1 2}
(println(dissoc {1 2 "hi" 4} "bye")) ; output: {1 2, hi 4}

; (println(dissoc [1 2 4 6 7] 3)) ; output: throws exception(dissoc doesn't work on vectors)
; (println(dissoc '(1 2 4 6 7) 3)) ; output: throws exception(dissoc doesn't work on lists)

; merge: returns a new map that combines the key-value pairs of one or more maps

(println ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" )

(println(merge {1 2 "hi" 4})) ; output: {1 2, hi 4}
(println(merge {1 2 "hi" 4} {"hi" 5, :yo 4})) ; output: {1 2, hi 5, :yo 4}
(println(merge {1 2 "hi" 4} {"hi" 5, :yo 4} {:yo 6})) ; output: {1 2, hi 5, :yo 6}
