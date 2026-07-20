class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        m = len(grid)
        n = len(grid[0])

        arr = []

        for i in range(m):
            for j in range(n):
                arr.append(grid[i][j])

        total = len(arr)
        k %= total

        new_arr = [0] * total

        for i in range(total):
            new_index = (i + k) % total
            new_arr[new_index] = arr[i]

        result = []
        idx = 0

        for i in range(m):
            row = []
            for j in range(n):
                row.append(new_arr[idx])
                idx += 1
            result.append(row)

        return result
        

        