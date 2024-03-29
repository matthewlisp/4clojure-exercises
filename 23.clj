;; Title: Reverse a sequence
;; Link: http://www.4clojure.com/problem/23
;; Description: Write a function which reverses a sequence.

;; QUESTION/TEST CODE

;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; SOLUTION CODE

#(reduce (fn [value coll-item] (conj value coll-item)) '() %)
