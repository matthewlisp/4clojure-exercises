;; Title: Nth Element
;; Link: http://www.4clojure.com/problem/21
;; Description: Write a function which returns the Nth element from a sequence.

;; QUESTION/TEST CODE

;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;; SOLUTION CODE

#(last (take (inc %2) %))
