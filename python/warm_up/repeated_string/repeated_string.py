#!/bin/python

"""
HackerRank Challenge: Warm-up Challenges -> Repeated String

Args:
    @:param s (str): String given by user
    @:param n (int): Integer given by user

Problem:
    - Assume string entered by user is infinitely repeating.
    - How many times is ACTIVATE_CHARACTER found in the repeating string up to index of n-1?

Solution:
    1. Identify the ACTIVATE_CHARACTER count for string 's'.
    2. Determine how many times the entire string 's' can fit into the repeating string up to n-1.
    3. Multiply result from step 1 by result from step 2 to get a base count
    4. Determine # of remaining characters up to index n-1 in repeating string
    5. Identify the ACTIVATE_CHARACTER count for substring of 's' from [0:x-1], where x is the result of step 4
    6. Return the sum of steps 3 and 5
"""

ACTIVATE_CHARACTER = 'a'


def repeatedString(s, n):
    """
    :param s:  str -> Repeating string
    :param n:  int -> Number of characters to include in repeating string
    :return:   # of occurences of ACTIVATE_CHARACTER in repeating string of s (str) up to index n-1 (int)

    f(s,n) = (# of occurences of 'a' in s) * (number of times entire 's' string fits in n) + (# of occurences of 'a' in 's' up to index of (remainder character count from n - 1))

    """
    return s.count(ACTIVATE_CHARACTER) * (n / len(s)) + s[:(n % len(s))].count(ACTIVATE_CHARACTER)


if __name__ == '__main__':
    print("Enter String:")
    s = raw_input()

    print("Enter Integer:")
    n = int(raw_input())

    result = repeatedString(s, n)

    print(result)
