Реализовать функцию:

public static List<Integer> inList1OrInList2( List<Integer> list1, List<Integer> list2)

, которая вернет список чисел, представленных по одному разу, которые есть в первом или во втором списке (вначале числа, которые есть в первом списке в порядке появления, затем числа, которые есть во втором списке (но нет в первом), также в порядке появления). Для удобства реализовать дополнительную функцию:

public static int indexOf(List<Integer> list, int value)

, которую использовать в реализации функции inList1NotInList2.