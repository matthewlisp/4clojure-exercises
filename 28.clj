;; Title: Flatten a Sequence
;; Link: http://www.4clojure.com/problem/28
;; Description: Write a function which flattens a sequence.

;; SOLUTION CODE

(fn my-flatten
  [[fst & rst :as col]]
  (if (empty? col) '()
      (if (coll? fst)
        (concat (my-flatten fst) (my-flatten rst))
        (cons fst (my-flatten rst)))))
