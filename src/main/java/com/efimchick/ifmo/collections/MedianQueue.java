package com.efimchick.ifmo.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

class MedianQueue extends ArrayDeque<Integer> {

    private static final long serialVersionUID = 1;
    private final PriorityQueue<Integer> left;
    private final PriorityQueue<Integer> right;

    MedianQueue() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    @Override
    public boolean offer(Integer integer) {
        if (right.size() > 0 && integer > right.peek()) {
            right.offer(integer);
            if (right.size() > left.size() + 1) {
                left.offer(right.poll());
            }
        } else {
            left.offer(integer);
            if (left.size() > right.size() + 1) {
                right.offer(left.poll());
            }
        }
        return true;
    }

    @Override
    public int size() {
        return left.size() + right.size();
    }

    @Override
    public Integer poll() {
        Integer pollElement;
        if (left.size() < right.size()) {
            pollElement = right.poll();
        } else {
            pollElement = left.poll();
        }
        return pollElement;
    }

    public Integer peek() {
        Integer peekElement;
        if (left.size() < right.size()) {
            peekElement = right.peek();
        } else {
            peekElement = left.peek();
        }
        return peekElement;
    }
}
