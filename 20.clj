;; Title: Penultimate Element
;; Link: http://www.4clojure.com/problem/20
;; Description:Write a function which returns the second to last element from a sequence. 

;; QUESTION/TEST CODE

;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; SOLUTION CODE

#(second (reverse %))
