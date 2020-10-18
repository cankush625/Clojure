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
