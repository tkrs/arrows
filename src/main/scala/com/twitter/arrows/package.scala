package com.twitter

package object arrows {
  type Task[+T] = Arrow[Unit, T]
}