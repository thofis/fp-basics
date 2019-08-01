var assert = require('assert');

describe('pure functions', function () {
  describe('examples of impure functions', function () {
    it('should work', function () {
      // impure, because IO is a sideeffect
      function printValue(value) {
        console.log(`value=${value}`)
        return value
      }
      // impure, because mutating state outside function scope
      // (but a valid example for a closure in js)
      let counter = 0;
      function incrementCounter(){
        counter++;
        return counter;
      }
      // impure, because throwing an error is a sideeffect
      function throwError(value){
        if (value < 0) throw new Error('lt 0');
        return value;
      }
      // impure, because return value differs for the same input
      function randomNumber() {
        return Math.random();
      }
      // pure (but useless)
      function fortyTwo() {
        return 42;
      }
      // pure
      function duplicate(n) {
        return 2 * n;
      }
      // pure, using a closure without modifying external state
      function incrementBy(n){
        return value => value + n
      }
      const incrementBy3 = incrementBy(3)
      assert(incrementBy3(2) === 5)

    });
  });
});