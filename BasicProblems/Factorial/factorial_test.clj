(ns mytest
    (:require [clojure.test :refer :all]))

(defn factorial [n]
    (if (= n 0) 1
        (* n (factorial (dec n)))))

(deftest test-factorial
    (testing "Test me"
    (is (= 120 (factorial 5)))))

(deftest test-factorial1
    (testing "Test me"
    (is (= 1 (factorial 0)))))

(run-tests)