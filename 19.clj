;; Title: Last Element
;; Link: http://www.4clojure.com/problem/19
;; Description: Write a function which returns the last element in a sequence.

;; QUESTION/TEST CODE

;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; SOLUTION CODE

#(first (reverse %))
