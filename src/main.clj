(ns main
  (:require [alda.core :refer :all]))


(defn pl [n]
  (play! (part "piano")
         (map #(chord (note (pitch %))) n)))

; raaga bhairavi
(pl [:c :d- :e- :f :g :a- :b- :> :c])

; raaga yaman
(pl [:b :< :d :e :f+ :a :b :> :c :c :< :b :a :g :f :e :d :c])

; raaga bhimpalasi
(pl [:b- :< :c :e- :f :g :b- :> :c :c :< :b- :a :g :f :e- :d :c])

(comment
;; play music here.
  (play! (part "piano")
         (for [notes [[:c :e :g] [:c :f :a] [:c :e :g]]]
           (apply chord (map #(note (pitch %)) notes))))

  )
