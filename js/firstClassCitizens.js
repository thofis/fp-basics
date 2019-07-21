var assert = require('assert');

describe('functions as first class citizens in javascript', function () {
  describe('assigning a function to variable', function () {
    it('should work', function () {
      const number = 42;
      const obj = {}

      const isEven = i => i % 2 === 0

      function negate(predicate) {
        return i => !predicate(i)
      }

      assert(isEven(0) === true)
      assert(isEven(1) === false)

      const isOdd = negate(isEven)

      assert(isOdd(0) === false)
      assert(isOdd(1) === true)

    });
  });
});