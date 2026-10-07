class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        n = len(nums)

        if n==1 or n==0:
            return nums

        mid = n//2

        arr1 = nums[:mid].copy()
        arr2 = nums[mid:].copy()

        arr1 = self.sortArray(arr1)
        arr2 = self.sortArray(arr2)

        res = self.mergeSort(arr1, arr2)

        return res

    def mergeSort(self, arr1, arr2):
        i, j = 0,0
        res = []

        while i<len(arr1) and j<len(arr2):
            elm1 = arr1[i]
            elm2 = arr2[j]

            if elm1 <= elm2:
                res.append(elm1)
                i+=1
            else:
                res.append(elm2)
                j+=1

        while i< len(arr1):
            elm = arr1[i]
            res.append(elm)
            i+=1

        while j < len(arr2):
            elm = arr2[j]
            res.append(elm)
            j+=1

        return res

        
            
