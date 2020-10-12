fibonacci :: Int -> Int
fibonacci x
  | x == 0 = 0
  | x < 3 = 1
  | otherwise = fibonacci (x-1) + fibonacci (x-2)
